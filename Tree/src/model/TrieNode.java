package model;

public class TrieNode {
	public TrieNode nodes[]=new TrieNode[26];
	public int end=0;
	
	public TrieNode next(char c) {
		return nodes[c-'a'];
	}
}
