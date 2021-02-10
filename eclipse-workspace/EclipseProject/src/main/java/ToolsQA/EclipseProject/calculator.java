package ToolsQA.EclipseProject;

public class calculator {
public int Add(int i,int j) {
	return i+j;
}
public int Sub(int i,int j) {
	return i-j;
}
public int Mul(int i,int j) {
	return i*j;
}
public int Div(int i,int j) {
	if(j==0) {
		return -1;
	}
	return i%j;
}
}
