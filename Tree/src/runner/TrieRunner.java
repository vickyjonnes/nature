package runner;

import java.util.ArrayList;
import java.util.List;

import operations.Trie;

public class TrieRunner {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("hello");
		list.add("hell");
		list.add("world");
		list.add("hello");
		list.add("new");
		list.add("anas");
		list.add("anam");
		Trie t=new Trie();
		list.forEach(t::insert);
		
		System.out.println(t.query("new"));
		t.update("world","hello");
		System.out.println(t.query("hello"));
		System.out.println(t.query("he"));
		System.out.println(t.query("h"));
		System.out.println(t.query("anam"));
		System.out.println(t.query("ana"));
	}

}
