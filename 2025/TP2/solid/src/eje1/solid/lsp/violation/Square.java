package eje1.solid.lsp.violation;

public class Square extends Rectangle {
	
	public void setBase(double valor) {
		super.setBase(valor);
		super.setHeight(valor);
	}

	public void setHeight(double valor) {
		super.setBase(valor);
		super.setHeight(valor);
	}
}
