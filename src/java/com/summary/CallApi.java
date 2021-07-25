/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summary;

import java.io.File;

/**
 *
 * @author HP
 */
public class CallApi {
    
    public StringBuilder getSummary(String path)
    {
    
		SummaryTool summary = new SummaryTool();
		summary.init(new File(path));
		summary.extractSentenceFromContext();
		summary.groupSentencesIntoParagraphs();
		summary.printSentences();
		summary.createIntersectionMatrix();

		//System.out.println("INTERSECTION MATRIX");
		//summary.printIntersectionMatrix();

		summary.createDictionary();
		//summary.printDicationary();

		System.out.println("SUMMMARY");
		summary.createSummary();
		StringBuilder builder= summary.printSummary();

		summary.printStats();
    
    return builder;
    }
    
}
