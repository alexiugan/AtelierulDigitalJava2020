package lab9.ch3;

import reactor.core.publisher.Mono;

public class Challenge3 {
    public Mono<String> emptyMono(){
        return Mono.empty();
    }

    public Mono<String> monoWithNoSignal(){
        return Mono.never();
    }

    public Mono<String> fooMono(){
        return Mono.just("Foo");
    }

    public Mono<String> errorMono(){
        return Mono.error(new IllegalStateException("Error"));
    }

}
