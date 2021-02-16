public class BadThreads {
    static String message;
    private static class CorrectorThread extends Thread {
        public void run() {
            try {
                sleep(2005);

            } catch (InterruptedException e) {}
            // Key statement 1:
            message = "Mares do eat oats.";

        }

    }



    public static void main(String args[])

            throws InterruptedException {
        (new CorrectorThread()).start();
        message = "Mares do not eat oats.";
        Thread.sleep(3000);
        // Key statement 2:

        message = "Mare doost'd eat oats";
        Thread.sleep(2000);
        message = "Mares donst'd eat oatsts";
        Thread.sleep(3000);

        System.out.println(message);
        Thread.sleep(2000);
        System.out.println(message);
        Thread.sleep(3000);
        System.out.println(message);

    }

}