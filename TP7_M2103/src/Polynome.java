public class Polynome {

    /**
     * degr� maximum du polyn�me
     */
    public static final int DEGRE_MAX = 99;
    /**
     * tableau contenant les coefficients des mon�mes du polyn�me
     */
    private float[] coefficients;

    /**
     * cr�e un polyn�me nul
     */
    public Polynome() {
        // cr�er le tableau des coefficients
        this.coefficients = new float[Polynome.DEGRE_MAX + 1];
        // mettre � 0 tous les coefficients
        for (int i = 0; i < this.coefficients.length; i++) {
            this.coefficients[i] = 0.0F;
        }
    }

    /**
     * positionne un nouveau mon�me dans un polyn�me
     * 
     * @param m
     *            mon�me � positionner dans le polyn�me
     * @throws IllegalArgumentException
     *             si l'exposant du mon�me est sup�rieur � DEGRE_MAX
     */
    public void setMonome(Monome m) throws IllegalArgumentException {
        if (m.getExposant() > Polynome.DEGRE_MAX) {
            throw new IllegalArgumentException("exposant du monome trop grand "
                    + m.getExposant() + " " + m);
        }
        this.coefficients[m.getExposant()] = m.getCoefficient();
    }

    /**
     * acc�de � un mon�me du polyn�me
     * 
     * @param exposant
     *            exposant du mon�me � acc�der
     * @throws IllegalArgumentException
     *             si l'exposant du mon�me n'est pas compris dans [0,DEGRE_MAX]
     */
    public Monome getMonome(int exposant) throws IllegalArgumentException {
        if (exposant < 0 || exposant > Polynome.DEGRE_MAX) {
            throw new IllegalArgumentException("exposant invalide " + exposant);
        }
        return new Monome(this.coefficients[exposant], exposant);
    }

    /**
     * calcule la d�riv�e d'un polyn�me
     * 
     * @return d�riv�e du polyn�me
     */
    public Polynome d�riv�e() {
        Polynome r�sultat = new Polynome();
        for (int i = 0; i < this.coefficients.length; i++) {
        	r�sultat.setMonome(this.getMonome(i).d�riv�e());
        }
        return r�sultat;
    }

    /**
     * calcule la somme de deux polyn�mes
     * 
     * @param p
     *            deuxi�me polyn�me associ� � la somme
     *            
     * @throws ArithmeticException
     *				si les exposants des 2 mon�mes ne sont pas les m�mes
     *         IllegalArgumentException
     *				si l'exposant du mon�me n'est pas compris dans [0,DEGRE_MAX]
     *
     * @return polyn�me resultat
     */
    public Polynome somme(Polynome p) throws ArithmeticException,IllegalArgumentException{
    	Polynome r�sultat = new Polynome();
        for (int i = 0; i < this.coefficients.length; i++) {
        	r�sultat.setMonome(this.getMonome(i).somme(p.getMonome(i)));
        }
        return r�sultat;
    }

    /**
     * calcule le produit d'un polyn�me et d'un mon�me
     * 
     * @param m
     *            mon�me associ� au produit
     * 
     * @throws IllegalArgumentException
     *             si l'exposant d'un mon�me du r�sultat est sup�rieur �
     *             DEGRE_MAX
     * @return polyn�me produit
     */
    public Polynome produit(Monome m) throws IllegalArgumentException {
        Polynome r�sultat = new Polynome();
    	for (int i = 0; i < this.coefficients.length; i++) {
        	if (m.getCoefficient()!=0 && this.getMonome(i).getCoefficient()!=0) {
        		r�sultat.setMonome(this.getMonome(i).produit(m));
        	}        	
        }
    	return r�sultat;
    }
    
    /**
     * calcule le degr� d'un polyn�me
     * 
     * @return degr� du polyn�me
     */
    public int degr�() throws ArithmeticException {
    	for (int n=0; n<=this.coefficients.length && this.getMonome(n).estNul(); n++) {
    		if (n==this.coefficients.length) {
    			throw new ArithmeticException ("Polyn�me nul");
    		}
    	}
    	int r�sultat = 0;
    	for(int i = 0; i < this.coefficients.length; i++) {
    		 if (!this.getMonome(i).estNul()) {
    			 r�sultat = this.getMonome(i).getExposant();
    		 }
    	 }
    	 return r�sultat;
    }
    
    /**
     * 
     * @param p
     * @return
     */
    public Polynome diff�rence(Polynome p) {
    	Polynome r�sultat = new Polynome();
    	for (int i = 0; i < this.coefficients.length; i++) {
    		if (this.getMonome(i).getExposant()==p.getMonome(i).getExposant()) {
    			r�sultat.setMonome(this.getMonome(i).somme(new Monome (-p.getMonome(i).getCoefficient(),i)));
    		}
    	}
    	return r�sultat;
    }

    @Override
    public String toString() {
        String r�sultat = "";
        for (int i = this.coefficients.length - 2; i >= 0; i--) {
            if (!this.getMonome(i).estNul()) {
                r�sultat += this.getMonome(i);
            }
        }
        if (r�sultat.equals("")) {
            return "0";
        }
        if (r�sultat.charAt(1) == '-') {
            return "-" + r�sultat.substring(3, r�sultat.length());
        }
        return r�sultat.substring(3, r�sultat.length());

    }

}
