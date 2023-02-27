public interface Predicate {

    boolean test(int number);

    // through anonymous class
    Predicate positiveCheck1 = new Predicate() {
        @Override
        public boolean test(int number) {
            return number > 0;
        }
    };

    //via lambda
    Predicate positiveCheck2 = (number) -> number > 0;
}

