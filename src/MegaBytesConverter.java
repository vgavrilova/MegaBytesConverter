public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        // The program is checking whether the inserted number of kilobytes is valid
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
//            int MegaBytes = (kiloBytes / 1024);
//            int remainderKiloBytes = (kiloBytes % 1024);

            // This method prints the value of converted megabytes and the remaining kilobytes
            int MegaBytes = megaConverter(kiloBytes);
            int remainderKiloBytes = remainderCalculator(kiloBytes);
            System.out.println(kiloBytes + " KB = " + MegaBytes + " MB and " + remainderKiloBytes + " KB");
        }
    }

    // A method for calculating megabytes
    public static int megaConverter(int kiloBytes) {
        if (kiloBytes < 0) {
            return -1;
        } else {
            return (kiloBytes / 1024);
        }
    }

    // A method for calculating remaining kilobytes
    public static int remainderCalculator(int kiloBytes) {
        if (kiloBytes < 0) {
            return -1;
        } else {
            return (kiloBytes % 1024);
        }
    }
}
