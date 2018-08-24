class Glyph{
    Glyph(){
    	System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
    void draw(){
    	System.out.println("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius=1;
    private String type ="round";
    private char c = 'd';
    private Person person = new Person("test");
    RoundGlyph(int r){
        radius = r;
        System.out.println(person + " ,RoundGlyph RoundGlyph(), radius = " + radius +",type ="+type +",c="+c);
    }
    void draw(){
    	System.out.println(person + " ,RoundGlyph RoundGlyph(), radius = " + radius +",type="+type+",c="+c);
    }

}
class Person {
	private String name ="ÕÅÈý" ;
	Person(String personName){
		name = personName;
	}
	public String getName(){
		return name;
	}
	
	public String toString(){
		return "name=" + name;
	}
}

public class PolyConstructors{
    public static void main(String[] args){
        new RoundGlyph(5);
    }
}