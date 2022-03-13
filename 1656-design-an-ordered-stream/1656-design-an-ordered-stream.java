class OrderedStream {
    String[] value_1;
    int i = 0;
    public OrderedStream(int n) {
        value_1 = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        value_1[idKey - 1] = value;   
        List<String> answer = new ArrayList<>();
        while (i < value_1.length && value_1[i] != null) {
            answer.add(value_1[i]);
            i++;
        }
        return answer;
    }
}
/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */