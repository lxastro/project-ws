package xlong.nlp.wordsegmentation;

public class WordSegmenters {
	private static WordSegmenter uniSegmenter = null;
	private static WordSegmenter biSegmenter = null;
	public static WordSegmenter getPeterNorvigUnigramSegmenter() {
		if (uniSegmenter == null) {
			uniSegmenter = new PeterNorvigUnigramSegmenter();
		}
		return uniSegmenter;
	}
	public static WordSegmenter getPeterNorvigBigramSegmenter() {
		if (biSegmenter == null) {
			biSegmenter = new PeterNorvigBigramSegmenter();
		}
		return biSegmenter;
	}
}
