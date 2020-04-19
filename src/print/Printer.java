package print;

public class Printer {
	// 创建两个组件(墨盒和纸张)
	private Ink ink;
	private Paper paper;
	public Ink getInk() {
		return ink;
	}
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print() {
		System.out.println(ink.getColor()+"在"+paper.getSize()+"打印内容");
	}
}
