package br.com.alura.algoritmos;

public class TestaMenorPreco {
	public static void main(String[] args) {
		Produto produtos[] = new Produto[5];
		produtos[0] =new Produto("Lamborghini", 1000000);
		produtos[1] =new Produto("Jipe", 46000);
		produtos[2] =new Produto("Brasilia", 16000);
		produtos[3] =new Produto("Smart", 46000);
		produtos[4] =new Produto("Fusca", 17000);
						
		
		
		
		double precos[] = new double[5];
		
		precos[0]=1000000;
		precos[1]=46000;
		precos[2]=16000;
		precos[3]=46000;
		precos[4]=17000;
		
		int maisBarato = 0;
				
		for(int atual = 0 ; atual <=4; atual ++) {
			if(precos[atual] < precos[maisBarato]) {
				maisBarato = atual;
			}
		}
		System.out.println(maisBarato);
		System.out.println("O carro mais barato custa " + precos[maisBarato]);
	}

}
