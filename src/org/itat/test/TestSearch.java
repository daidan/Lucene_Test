package org.itat.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.Query;
import org.apache.lucene.util.Version;
import org.itat.index.FileIndexUtils;
import org.itat.index.SearcherUtil;
import org.junit.Before;
import org.junit.Test;

public class TestSearch {
	private SearcherUtil su;
	@Before
	public void init() {
		su = new SearcherUtil();
	}
	
	@Test
	public void indexFile() {
		FileIndexUtils.index(true);
	}
	
	@Test
	public void testSearchPage01() {
		System.out.println("-------------------------------");
		su.searchNoPage("source");
	}
	
	@Test
	public void testSearchPage02() {
		su.searchPageByAfter("java", 3,20);
	}
	
}
