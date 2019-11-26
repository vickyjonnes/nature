package operations;

import model.TrieNode;

public class Trie {
	TrieNode root;
	public Trie() {
		root=new TrieNode();
	}
	
	public void insert(String s) {
		TrieNode current=root;
		for(int i=0;i<s.length();i++) {
			if(current.nodes[s.charAt(i)-'a']==null) {
				current.nodes[s.charAt(i)-'a']=new TrieNode();
			}
			current.nodes[s.charAt(i)-'a'].end++;
			//System.out.println(s.charAt(i)+" : "+current.nodes[s.charAt(i)-'a'].end);
			//current.end++;
			current=current.next(s.charAt(i));
		}
	}
	
	public int query(String s) {
		TrieNode current=root;
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(current.nodes[s.charAt(i)-'a']==null) {
				return 0;
			}
			count=current.nodes[s.charAt(i)-'a'].end;
			current=current.next(s.charAt(i));
		}
		return count;
	}
	
	public void delete(String s) {
		TrieNode current=root;
		for(int i=0;i<s.length();i++) {
			if(current.nodes[s.charAt(i)-'a']==null) {
				return;
			}
			if(current.nodes[s.charAt(i)-'a'].end>0)
				current.nodes[s.charAt(i)-'a'].end--;
			else
				return;
			current=current.next(s.charAt(i));
		}
		
	}
	
	public void update(String oldStr, String newStr) {
		delete(oldStr);
		insert(newStr);
	}
}
