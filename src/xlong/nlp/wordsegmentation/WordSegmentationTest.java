package xlong.nlp.wordsegmentation;

import java.util.Vector;

public class WordSegmentationTest {
	private static String[] testStrings = new String[] {
		"choosespain",
		"thisisatest",
		"wheninthecourseofhumaneventsitbecomesnecessary",
		"whorepresents",
		"expertsexchange",
		"speedofart",
		"nowisthetimeforallgood",
		"itisatruthuniversallyacknowledged",
		"itwasabrightcolddayinaprilandtheclockswerestrikingthirteen",
		"itwasthebestoftimesitwastheworstoftimesitwastheageofwisdomitwastheageoffoolishness",
		"asgregorsamsaawokeonemorningfromuneasydreamshefoundhimselftransformedinhisbedintoagiganticinsect",
		"inaholeinthegroundtherelivedahobbitnotanastydirtywetholefilledwiththeendsofwormsandanoozysmellnoryetadrybaresandyholewithnothinginittositdownonortoeatitwasahobbitholeandthatmeanscomfort",
		"faroutintheunchartedbackwatersoftheunfashionableendofthewesternspiralarmofthegalaxyliesasmallunregardedyellowsun",
	};
	public static void main(String[] args) {
		WordSegmenter segmenter = new PeterNorvigUnigramSegmenter();
		for (String str:testStrings) {
			Vector<String> words = segmenter.segment(str);
			for (String word:words) {
				System.out.print(word + " ");
			}
			System.out.println();
		}
		System.out.println();
		segmenter = new PeterNorvigBigramSegmenter();
		for (String str:testStrings) {
			Vector<String> words = segmenter.segment(str);
			for (String word:words) {
				System.out.print(word + " ");
			}
			System.out.println();
		}
	}
}
