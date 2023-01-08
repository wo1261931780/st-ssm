package com.stssm.github.io.junw.bbb016spring20230104.domain;

public class Demo0104DomainAddress {
	private String localPlace;
	private int localPrice;

	public Demo0104DomainAddress() {
	}

	public Demo0104DomainAddress(String localPlace, int localPrice) {
		this.localPlace = localPlace;
		this.localPrice = localPrice;
	}

	@Override
	public String toString() {
		return "Demo0104DomainAddress{" +
				       "localPlace='" + localPlace + '\'' +
				       ", localPrice=" + localPrice +
				       '}';
	}

	public String getLocalPlace() {
		return localPlace;
	}

	public void setLocalPlace(String localPlace) {
		this.localPlace = localPlace;
	}

	public int getLocalPrice() {
		return localPrice;
	}

	public void setLocalPrice(int localPrice) {
		this.localPrice = localPrice;
	}
}
