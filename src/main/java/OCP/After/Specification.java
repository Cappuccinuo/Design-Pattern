package OCP.After;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
