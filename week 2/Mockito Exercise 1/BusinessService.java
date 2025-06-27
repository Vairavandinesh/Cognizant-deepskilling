public class BusinessService {

    private DataRepository repo;

    public BusinessService(DataRepository repo) {
        this.repo = repo;
    }

    public int findMax() {
        int[] data = repo.getData(); // will be mocked
        int max = Integer.MIN_VALUE;
        for (int num : data) {
            if (num > max) max = num;
        }
        return max;
    }
}
