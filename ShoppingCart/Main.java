class Main {
  public static void main(String[] args) {
    Cart cart = new Cart();
	cart.addItem("Scarf", 26.99f);
	cart.addItem("Headphones", 49.99f);
	cart.addItem("Compressed Air Can", 8.99f);

	System.out.println(cart);
  }
}