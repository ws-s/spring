package 静态代理;
/**
 * 代理包租婆
 * @author lindy
 * @创建时间 2020年4月14日下午3:12:58
 */
public class ProxyLand {
	private Landlady land;
	
	public void proxyTenement() {
		if(land == null) {
			land = new Landlady();
		}
		Intermediary.before();
		land.tenement();
		Intermediary.after();
	}
}
