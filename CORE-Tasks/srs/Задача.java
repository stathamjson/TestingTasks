import java.util.Objects;

public class Задача {

    public static class Pair<T, V> {
        private T obT;
        private V obV;

        private Pair(T obT, V obV) {
            this.obT = obT;
            this.obV = obV;
        }

        public static <T, V> Pair<T, V> of(T obT, V obV) {

            return new Pair<>(obT, obV);
        }

        public T getFirst() {

            return obT;
        }

        public V getSecond() {

            return obV;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(obT, pair.obT) &&
                    Objects.equals(obV, pair.obV);
        }

        @Override
        public int hashCode() {
            return Objects.hash(obT, obV);
        }
    }
}
