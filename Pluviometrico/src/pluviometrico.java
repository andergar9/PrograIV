import javax.swing.JOptionPane;

public class pluviometrico {

	public static void main(String[] args) {
		double  lado, a, b, teta, r, h, v;
		double aTejado;
		double aCanal;
		double aTanque;
		double areaTotal;
		double vTanque;
		double vLluvia;
		double t;
		
		lado =  Double.valueOf(JOptionPane.showInputDialog("Ingrese Lado L:"));
		a =  Double.valueOf(JOptionPane.showInputDialog("Ingrese Lado a:"));
		b =  Double.valueOf(JOptionPane.showInputDialog("Ingrese ancho B:"));
		teta = Double.valueOf(JOptionPane.showInputDialog("Ingrese Angulo teta:"));
		r =  Double.valueOf(JOptionPane.showInputDialog("Ingrese Radio r:"));
		h =  Double.valueOf(JOptionPane.showInputDialog("Ingrese altura h:"));
		v =  Double.valueOf(JOptionPane.showInputDialog("Ingrese Volumen Lluvia:"));

		aTejado = lado * a * Math.cos(teta);
	    aCanal = lado * b;
		aTanque = Math.PI * Math.pow(r, 2);
		areaTotal = (aTejado + aCanal + aTanque) / 100; 
		vTanque = (Math.PI * Math.pow(r, 2) * h) /100;
		vLluvia = (v / 1000) * areaTotal;
		
		t = vTanque / vLluvia;
		JOptionPane.showMessageDialog(null, "El tiempo es:" + t);
		

	}

}
