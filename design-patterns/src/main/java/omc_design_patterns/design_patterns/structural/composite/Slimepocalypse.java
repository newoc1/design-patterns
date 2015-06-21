package omc_design_patterns.design_patterns.structural.composite;

public class Slimepocalypse {

	public static void main(String[] args) {
		SlimeGroup group1 = new SlimeGroup();
		AbstractSlime blue1 = new BlueSlime();
		AbstractSlime red1 = new RedSlime();
		AbstractSlime green1 = new GreenSlime();
		group1.add(blue1);
		group1.add(red1);
		group1.add(green1);
		
		System.out.println("group1 has : "+group1.getSlimes().size());
		SlimeGroup group2 = new SlimeGroup();
		AbstractSlime blue2 = new BlueSlime();
		AbstractSlime red2 = new RedSlime();
		AbstractSlime green2 = new GreenSlime();
		group2.add(blue2);
		group2.add(red2);
		group2.add(green2);
		
		group1.add(group2);
		System.out.println("group1 has : "+group1.getSlimes().size());
		SlimeGroup group3 = new SlimeGroup();
		AbstractSlime blue3 = new BlueSlime();
		AbstractSlime red3 = new RedSlime();
		AbstractSlime green3 = new GreenSlime();
		group3.add(blue3);
		group3.add(red3);
		group3.add(green3);
		
		group1.devour(group3);
		group1.split();
		System.out.println("group1 has : "+group1.getSlimes().size());
		
		SlimeGroup group4 = new SlimeGroup();
		AbstractSlime blue4 = new BlueSlime();
		AbstractSlime red4 = new RedSlime();
		AbstractSlime green4 = new GreenSlime();
		group4.add(blue4);
		group4.add(red4);
		group4.add(green4);
		
		group4.devour(group1);
		
		group4.split();
		System.out.println("group4 has : "+group4.getSlimes().size());
	}

}
