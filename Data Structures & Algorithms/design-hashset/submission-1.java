class MyHashSet {
    HashSet<Integer> hashset;
    public MyHashSet() {
       hashset = new HashSet<>(); 
    }
    
    public void add(int key) {
        hashset.add(key);
    }
    
    public void remove(int key) {
        hashset.remove(key);
    }
    
    public boolean contains(int key) {
        return hashset.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */