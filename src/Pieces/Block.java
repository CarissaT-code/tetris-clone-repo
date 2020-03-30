package Pieces;

public class Block {

	
	private double x;
	private double y;
	
	
	public Block(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	

	public double getX() {
		return this.x;
		
	}
	
	public double getY() {
		return this.y;
		
	}
	
	public void moveLeft() {
		this.x -= 1;
	}
	
	public void moveRight() {
		this.x += 1;
	}
	
	public void moveDown() {
		this.y -= 1;
	}
	
}
