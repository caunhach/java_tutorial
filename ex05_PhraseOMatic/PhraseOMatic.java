package ex05_PhraseOMatic;

public class PhraseOMatic {
	public static void main(String[] args){
		String[] animals = {"cat", "dog", "lion", "tiger"};
		String[] girls = {"Miyabi", "Aoi", "Yua"};
		String[] acts = {"blowjob", "Mission", "Anal-Sex", "Skinchip"};
		int len_animals = animals.length;
		int len_girls = girls.length;
		int len_acts = acts.length;
		int rand1 = (int) (Math.random() * animals.length);
		int rand2 = (int) (Math.random() * girls.length);
		int rand3 = (int) (Math.random() * acts.length);
		String Phrase = animals[rand1] + " " + girls[rand2] + " " + acts[rand3];
		System.out.println(Phrase);
	}
}
