public class design2 {
	
	public static void main (String[] args) {

	Turtle t = new Turtle();

	t.delay(0);
	t.penup();
	t.right(90);
	t.forward(200);
	t.left(90);
	t.backward(300);
	t.pendown();

	rectangleTree(t, 200, 25, 6);

	t.penup();
	t.forward(400);
	t.pendown();
	rectangleTree(t, 200, 25, 4);

	t.penup();
	t.forward(400);
	t.pendown();
	rectangleTree(t, 200, 25, 5);

	}

	public static void rectangleTree (Turtle t, double length, double breadth, int level) {

		int red = (int)(Math.random() * 256);
    	int green = 255 - Math.min(63 * level, 255);
    	int blue =  255 - Math.min(20 * level, 255);

    	t.color(red, green, blue);

		if (level == 0) {

			for (int i = 0; i < 2; i++) {

				t.forward(breadth);
				t.left(90);
				t.forward(length);
				t.left(90);
			
			}
		}

		else {

			for (int i = 0; i < 2; i++) {

				t.forward(breadth);
				t.left(90);
				t.forward(length);
				t.left(90);
			
			}

			t.left(90);
			t.penup();
			t.forward(length);
			t.pendown();
			t.right(60);
			rectangleTree(t, length * 0.6, breadth / 2, level - 1);
			t.left(60);
			t.penup();
			t.backward(length);
			t.pendown();
			t.right(90);

			t.penup();
			t.forward(breadth);
			t.left(90);
			t.forward(length);
			t.right(140);
			t.pendown();
			rectangleTree(t, length * 0.4, breadth / 2, level - 1);
			t.penup();
			t.left(140);
			t.backward(length);
			t.right(90);
			t.backward(breadth);
			t.pendown();

			t.penup();
			t.left(90);
			t.forward(length);
			t.right(110);
			t.pendown();
			rectangleTree(t, length * 0.6, breadth / 2, level - 1);
			t.penup();
			t.left(110);
			t.backward(length);
			t.right(90);
			t.pendown();

			t.penup();
			t.left(90);
			t.forward(length / 2);
			t.right(50);
			t.pendown();
			rectangleTree(t, length / 2.5, breadth / 2, level - 1);
			t.penup();
			t.left(50);
			t.backward(length / 2);
			t.right(90);
			t.pendown();

			t.penup();
			t.forward(breadth);
			t.left(90);
			t.forward(length / 3);
			t.right(140);
			t.pendown();
			rectangleTree(t, length * 0.4, breadth / 2, level - 1);
			t.penup();
			t.left(140);
			t.backward(length / 3);
			t.right(90);
			t.backward(breadth);
			t.pendown();
		}

	}
}