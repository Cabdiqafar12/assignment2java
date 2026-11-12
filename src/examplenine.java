public class examplenine {
    public class EmptyCollectionException extends RuntimeException {
        public EmptyCollectionException(String collection) {
            super("The " + collection + " is empty.");
        }
    }

}
