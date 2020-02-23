class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare () {
        System.out.println("бах бах бах");

    }
    void playTopHat () {
        System.out.println("динь динь динь");
    }

}
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();

    }
}
