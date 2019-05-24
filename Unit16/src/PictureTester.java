/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testkeepOnlyBlue() { 
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore(); 
	  beach.keepOnlyBlue();
	  beach.explore(); 
  }
  
  public static void testkeepOnlyRed() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore(); 
	  beach.keepOnlyRed();
	  beach.explore(); 
  }
  
  public static void testkeepOnlyGreen() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore(); 
	  beach.keepOnlyGreen();
	  beach.explore(); 
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
	  Picture caterpillar = new Picture("src/images/caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal() {
	  Picture motorcycle = new Picture("src/images/redMotorcycle.jpg"); 
	  motorcycle.explore(); 
	  motorcycle.mirrorHorizontal(); 
	  motorcycle.explore(); 
  }
  public static void testMirrorHorizontalBotToTop() {
	  Picture motorcycle = new Picture("src/images/redMotorcycle.jpg"); 
	  motorcycle.explore(); 
	  motorcycle.mirrorHorizontalBotToTop(); 
	  motorcycle.explore(); 
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms() {
	  Picture snowman = new Picture("src/images/snowman.jpg"); 
	  snowman.explore(); snowman.mirrorArms(); 
	  snowman.explore(); 
  }
  
  public static void testMirrorGull() { 
	  Picture gulls = new Picture("src/images/seagull.jpg"); 
	  gulls.explore();
	  gulls.mirrorGull(); 
	  gulls.explore(); 
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testmyCollage() {
	  Picture canvas = new Picture("src/images/640x480.jpg"); 
	  canvas.myCollage();
	  canvas.explore(); 
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void edgeDetection2() { 
Picture swan = new Picture("src/images/swan.jpg");
  swan.edgeDetection(10);
  swan.explore();
  }
  public static void testNegate() {
	  Picture swan = new Picture("src/images/swan.jpg"); 
	  swan.explore(); 
	  swan.Negate(); 
	  swan.explore(); 
  }
  
  public static void testGrayscale() {
	  Picture swan = new Picture("src/images/swan.jpg"); 
	  swan.explore(); 
	  swan.grayscale(); 
	  swan.explore(); 
  }
  
  public static void testWater() {
	  Picture water = new Picture("src/images/water.jpg");
	  water.explore(); 
	  water.fixUnderwater(); 
	  water.explore(); 
  }
  
  public static void testEncodeAndDecode() { 
	  Picture beach = new Picture("src/images/beach.jpg");
	  Picture code = new Picture("src/images/apple_icon.jpg");
	  beach.explore(); 
	  beach.encode(code);
	  code.explore(); 
	  beach.explore(); 
	  Picture result = beach.decode(); 
	  result.explore(); 
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testkeepOnlyBlue();
    //testkeepOnlyRed();
    //testkeepOnlyGreen();
    //testNegate();
   //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft(); 
	  //testMirrorHorizontal(); 
	//testMirrorHorizontalBotToTop(); 
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testmyCollage(); 
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  //testWater(); 
  }
}