class TrieNode
{
    Map<Character,TrieNode> children;
    boolean isEndOfWord;
    TrieNode()
    {
        this.children = new HashMap<Character,TrieNode>();
        this.isEndOfWord = false;
    }
}
class Trie 
{
    static TrieNode root;
    public Trie() 
    {
        root = new TrieNode();
    }
    
    public void insert(String word) 
    {
        TrieNode node = root;
        for(char c:word.toCharArray())
        {
            node.children.putIfAbsent(c,new TrieNode());
            node = node.children.get(c);
        }
        node.isEndOfWord = true;
    }
    
    public boolean search(String word) 
    {
        TrieNode node = root;
        for(char c:word.toCharArray())
        {
            node = node.children.get(c);
            if(node == null)
            {
                return false;
            }
        }
        return node.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) 
    {
        TrieNode node = root;
        for(char c:prefix.toCharArray())
        {
            node = node.children.get(c);
            if(node == null)
            {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */