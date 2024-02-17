class CountDownTimer implements Runnable{
    private int seconds;
    public CountDownTimer (int seconds){
        this.seconds = seconds;
    }
    public void run(){
        for (int i = seconds; i>=0; i--){
            System.out.println(i);
            try{
                Thread.sleep(10);

            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

}
