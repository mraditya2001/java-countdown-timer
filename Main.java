class Main {
    public static void main(String[] args) {
        CountDownTimer watch = new CountDownTimer(100);
        Thread thread = new Thread(watch);
        thread.start();
    }
}

