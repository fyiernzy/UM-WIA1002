package Friday.Utils;

@FunctionalInterface
public interface Transformer<A, B> {
    B transform(A a);
}
