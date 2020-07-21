package ncDongBoLuongsycnThread;

public class ShareDataV2 {
    public int x = 0;
    public int rad = 0;
    public synchronized void add(int plus){
        x += plus;
        System.out.println("\nDay so x :"+x);
        for (int i = 0; i < x; i++) {
            System.out.print(" "+i);
        }
    }
}
