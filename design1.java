public class design1 {
	
	public static void main (String[] args) {

		Turtle bob = new Turtle();
		bob.delay(0);
		bob.penup();
		bob.backward(300);
		bob.pendown();
		bob.left(90);
		fractalTree(bob, 300, 10);
		bob.right(90);
		bob.penup();
		bob.forward(300);
		bob.left(90);
		bob.pendown();
		fractalTree(bob, 200, 5);
		bob.right(90);
		bob.penup();
		bob.forward(300);
		bob.left(90);
		bob.pendown();
		fractalTree(bob, 250, 9);



	}

	public static void fractalTree (Turtle t, int size, int level) { // recursive method that draws a tree with 5 branches and random colors

		int red = 0;
    	int green = (int)(Math.random() * 256); // random shade of green
    	int blue = (int)(Math.random() * 256); // random shade of blue
    	
    	t.color(red, green, blue);

		if (level == 0) { // base case: if level is 0, draw the branch of the tree

			t.forward(size);
			t.penup();
			t.backward(size);
			t.pendown();

		}

		else { // recursive case: if level is greater than 0

			t.forward(size / 6); // moves turtle forward by 1/6th of the size
			t.right(30); 
			fractalTree(t, size / 3, level - 1); // recursively draws fractal tree with size 1/3rd of the original
			t.left(30);
			t.backward(size / 6); // returns turtle to original position

			t.forward(size / 3); // moves turtle forward by 1/3rd of the size
			t.left(30);
			fractalTree(t, size * 2 / 3, level - 1); // recursively draws fractal tree with size 2/3rd of the original
			t.right(30);
			t.backward(size / 3); // returns turtle to original position

			t.forward(size / 2); // moves turtle forward by 1/2 the size
			t.right(25);
			fractalTree(t, size / 2, level - 1); // recursively draws fractal tree with size 1/2 of the original
			t.left(25);
			t.backward(size / 2); // returns turtle to original position

			t.forward(size * 5 / 6); // moves turtle forward by 5/6th the size
			t.right(25);
			fractalTree(t, size / 2, level - 1); // recursively draws fractal tree with size 1/2 the original
			t.left(25);
			t.backward(size * 5 / 6); // returns turtle to the original position

		}
	}
}