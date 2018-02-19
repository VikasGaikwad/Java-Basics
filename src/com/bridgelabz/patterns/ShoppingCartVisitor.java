package com.bridgelabz.patterns;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
