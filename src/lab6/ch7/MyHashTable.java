package lab6.ch7;

import java.util.ArrayList;

public class MyHashTable<K, V> implements myHashTableInterface<K, V>{

    ArrayList<HashNode<K, V>> bucket;
    private int numBuckets;
    private int size;

    public MyHashTable()
    {
        bucket = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        for (int i = 0; i < numBuckets; i++)
            bucket.add(null);
    }

    private int getBucketIndex(K key)
    {
        int hashCode = key.hashCode();
        return hashCode % numBuckets;
    }

    @Override
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = bucket.get(bucketIndex);

        while (head != null)
        {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }
        return null;
    }

    @Override
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K,V> head = bucket.get(bucketIndex);

        while (head != null)
        {
            if(head.key.equals(key))
            {
                head.value = value;
                return ;
            }
            head = head.next;
        }

        size++;
        head = bucket.get(bucketIndex);
        HashNode<K,V> newNode = new HashNode<>(key, value);
        newNode.next = head;
        bucket.set(bucketIndex, newNode);

        if ((1.0*size)/numBuckets >= 0.7)
        {
            ArrayList<HashNode<K, V>> temp = bucket;
            bucket = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++)
                bucket.add(null);

            for (HashNode<K, V> headNode : temp)
            {
                while (headNode != null)
                {
                   // bucket.add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    @Override
    public void remove(K key) {
        // Apply hash function to find index for given key
        int bucketIndex = getBucketIndex(key);

        // Get head of chain
        HashNode<K, V> head = bucket.get(bucketIndex);

        // Search for key in its chain
        HashNode<K, V> prev = null;
        while (head != null)
        {
            // If Key found
            if (head.key.equals(key))
                break;

            // Else keep moving in chain
            prev = head;
            head = head.next;
        }

        // If key was not there
        if (head == null)
            return ;

        // Reduce size
        size--;

        // Remove key
        if (prev != null)
            prev.next = head.next;
        else
            bucket.set(bucketIndex, head.next);
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
