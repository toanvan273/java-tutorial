package ncDongBoLuongsycnThread;

public class Test {
    public static void main(String[] args) {
        ShareDataV2 shareDataV2 = new ShareDataV2();
        Thread1 t1 = new Thread1(shareDataV2);
        Thread2 t2 = new Thread2(shareDataV2);
        t1.start();
        t2.start();
    }
}
