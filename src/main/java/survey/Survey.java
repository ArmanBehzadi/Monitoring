package survey;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Survey {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Survey(int id) {
		super();
		this.id = id;
	}

	public Survey() {
		super();
	}

	private String content;

	private double valueDelivery;
	private int strategicAlignment;
	private int resourceManagement;
	private int riskManagement;
	private int performance;
	
	private double avgDelvieryValue;
	private int avgStrategicAlignment;
	private int avgResourceManagement;
	private int avgRiskManagement;
	private int avgPerformance;
	
	public int getAvgStrategicAlignment() {
		return avgStrategicAlignment;
	}

	public void setAvgStrategicAlignment(int avgStrategicAlignment) {
		this.avgStrategicAlignment = avgStrategicAlignment;
	}

	public int getAvgRiskManagement() {
		return avgRiskManagement;
	}

	public void setAvgRiskManagement(int avgRiskManagement) {
		this.avgRiskManagement = avgRiskManagement;
	}

	public int getAvgPerformance() {
		return avgPerformance;
	}

	public void setAvgPerformance(int avgPerformance) {
		this.avgPerformance = avgPerformance;
	}
	public int getAvgResourceManagement() {
		return avgResourceManagement;
	}

	public void setAvgResourceManagement(int avgResourceManagement) {
		this.avgResourceManagement = avgResourceManagement;
	}


	
	public double getAvgDelvieryValue() {
		return avgDelvieryValue;
	}

	public void setAvgDelvieryValue(double avgDelvieryValue) {
		this.avgDelvieryValue = avgDelvieryValue;
	}

	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int l;
	private int m;
	private int n;
	private int o;
	private int p;
	private int q;
	private int r;
	private int s;
	private int t;
	private int u;
	private int v;
	private int w;
	private int x;
	private int y;
	private int z;
	private int ab;
	private int ac;
	private int ad;
	private int ae;
	private int af;
	private int ag;
	private int ah;
	private int ai;
	private String empfValueDelivery;
	private String empfStrategicAlignment;
	private String empfResourceManagement;
	private String empfRiskManagement;
	private String empfPerformance;

	// Berechnungen für die Handlungsempehlung
	public String getEmpfValueDelivery() {
		if (valueDelivery > 40) {
			this.empfValueDelivery = "Sehr gut";
		}
		if (valueDelivery >= 20 && valueDelivery <= 40) {
			this.empfValueDelivery = "gut";
		}
		if (valueDelivery >= 10 && valueDelivery <= 19) {
			this.empfValueDelivery = "naja";
		}
		if (valueDelivery < 10) {
			this.empfValueDelivery = "Taaaqiiiifsha";
		}
		return empfValueDelivery;
	}

	public String getEmpfStrategicAlignment() {
		if (strategicAlignment > 40) {
			this.empfStrategicAlignment = "Sehr gut";
		}
		if (strategicAlignment >= 20 && strategicAlignment <= 40) {
			this.empfStrategicAlignment = "gut";
		}
		if (strategicAlignment >= 10 && strategicAlignment <= 19) {
			this.empfStrategicAlignment = "naja";
		}
		if (strategicAlignment < 10) {
			this.empfStrategicAlignment = "Taaaqiiiifsha";
		}
		return empfStrategicAlignment;
	}

	public String getEmpfRiskManagement() {
		if (riskManagement > 40) {
			this.empfRiskManagement = "Sehr gut";
		}
		if (riskManagement >= 20 && riskManagement <= 40) {
			this.empfRiskManagement = "gut";
		}
		if (riskManagement >= 10 && riskManagement <= 19) {
			this.empfRiskManagement = "naja";
		}
		if (riskManagement < 10) {
			this.empfRiskManagement = "Taaaqiiiifsha";
		}
		return empfRiskManagement;
	}

	public String getEmpfPerformance() {
		if (performance > 40) {
			this.empfPerformance = "Sehr gut";
		}
		if (performance >= 20 && performance <= 40) {
			this.empfPerformance = "gut";
		}
		if (performance >= 10 && performance <= 19) {
			this.empfPerformance = "naja";
		}
		if (performance < 10) {
			this.empfPerformance = "Taaaqiiiifsha";
		}
		return empfPerformance;
	}

	public String getEmpfResourceManagement() {
		if (resourceManagement > 40) {
			this.empfResourceManagement = "Sehr gut";
		}
		if (resourceManagement >= 20 && resourceManagement <= 40) {
			this.empfResourceManagement = "gut";
		}
		if (resourceManagement >= 10 && resourceManagement <= 19) {
			this.empfResourceManagement = "naja";
		}
		if (resourceManagement < 10) {
			this.empfResourceManagement = "Taaaqiiiifsha";
		}
		return empfResourceManagement;
	}

	// Alle setter und getter Methoden
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		valueDelivery += a;
		performance += a;
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		strategicAlignment += b;
		resourceManagement += b;
		riskManagement += b;
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		valueDelivery += c;
		performance += c;
		strategicAlignment += c;
		resourceManagement += c;
		riskManagement += c;
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		valueDelivery += d;
		strategicAlignment += d;
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		strategicAlignment += e;
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		strategicAlignment += f;
		this.f = f;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		valueDelivery += g;
		strategicAlignment += g;
		this.g = g;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		valueDelivery += h;
		this.h = h;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		valueDelivery += i;
		performance += i;
		strategicAlignment += i;
		resourceManagement += i;
		riskManagement += i;
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		valueDelivery += j;
		strategicAlignment += j;
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		strategicAlignment += k;
		this.k = k;
	}

	// continue here !!!
	public int getL() {
		return l;
	}

	public void setL(int l) {
		valueDelivery += l;
		strategicAlignment += l;
		this.l = l;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		strategicAlignment += m;
		riskManagement += m;
		performance += m;
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		valueDelivery += n;
		performance += n;
		strategicAlignment += n;
		resourceManagement += n;
		this.n = n;
	}

	public int getO() {
		return o;
	}

	public void setO(int o) {
		performance += o;
		strategicAlignment += o;
		this.o = o;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		valueDelivery += p;
		performance += p;
		strategicAlignment += p;
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		valueDelivery += q;
		strategicAlignment += q;
		this.q = q;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		resourceManagement += r;
		this.r = r;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		performance += s;
		this.s = s;
	}

	public int getU() {
		return u;
	}

	public void setU(int u) {
		riskManagement += u;
		this.u = u;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		strategicAlignment += t;
		this.t = t;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		valueDelivery += v;
		performance += v;
		this.v = v;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		riskManagement += w;
		this.w = w;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		riskManagement += x;
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		riskManagement += y;
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		performance += z;
		this.z = z;
	}

	public int getAb() {
		return ab;
	}

	public void setAb(int ab) {
		strategicAlignment += ab;
		resourceManagement += ab;
		riskManagement += ab;
		this.ab = ab;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		strategicAlignment += ac;
		this.ac = ac;
	}

	public int getAd() {
		return ad;
	}

	public void setAd(int ad) {
		performance += ad;
		this.ad = ad;
	}

	public int getAe() {
		return ae;
	}

	public void setAe(int ae) {
		strategicAlignment += ae;
		this.ae = ae;
	}

	public int getAf() {
		return af;
	}

	public void setAf(int af) {
		valueDelivery += af;
		resourceManagement += af;
		riskManagement += af;
		this.af = af;
	}

	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		valueDelivery += ag;
		resourceManagement += ag;
		riskManagement += ag;
		this.ag = ag;
	}

	public int getAh() {
		return ah;
	}

	public void setAh(int ah) {
		valueDelivery += ah;
		resourceManagement += ah;
		riskManagement += ah;
		this.ah = ah;
	}

	public int getAi() {
		return ai;
	}

	public void setAi(int ai) {
		resourceManagement += ai;
		strategicAlignment += ai;
		this.ai = ai;
	}

	

	public double getValueDelivery() {
		return valueDelivery;
	}

	public void setValueDelivery(double valueDelivery) {
		this.valueDelivery = valueDelivery;
	}

	public int getStrategicAlignment() {
		return strategicAlignment;
	}

	public void setStrategicAlignment(int strategicAlignment) {
		this.strategicAlignment = strategicAlignment;
	}

	public int getResourceManagement() {
		return resourceManagement;
	}

	public void setResourceManagement(int resourceManagement) {
		this.resourceManagement = resourceManagement;
	}

	public int getRiskManagement() {
		return riskManagement;
	}

	public void setRiskManagement(int riskManagement) {
		this.riskManagement = riskManagement;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}



}
