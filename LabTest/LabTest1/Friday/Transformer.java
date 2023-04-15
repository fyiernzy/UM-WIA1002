public interface Transformer<A, B> {
    B convertFrom(A from);
}
