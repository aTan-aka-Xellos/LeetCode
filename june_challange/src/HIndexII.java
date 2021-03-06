public class HIndexII {

    public int hIndex(int[] citations) {
        int mid, lo = 0, size = citations.length, hi = size;

        while (lo < hi) {
            mid = (hi + lo) >>> 1;
            if (citations[mid] == size - mid) return size - mid;
            else if (citations[mid] < size - mid) lo = mid + 1;
            else hi = mid;
        }
        return size - lo;
    }

}
