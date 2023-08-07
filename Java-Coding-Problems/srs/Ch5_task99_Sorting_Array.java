public class Ch5_task99_Sorting_Array {
    public static void main(String[] args) {

    }

    class Melon {

        private final String type;
        private final int weight;

        public Melon(String type, int weight) {
            this.type = type;
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return type + "(" + weight + "g)";
        }
    }
}
