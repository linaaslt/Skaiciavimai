package ernadas.labasspring;

public enum LstKeitimai {
	
	DEST_DVEJ ("sk_dest_dvej", "Iš dešimtainės į devejtainę")
	,DEST_SES ( "sk_dest_ses", "Iš dešimtainės į šešioliktainę")
	,DVEJ_DEST ("sk_dvej_desimt", "Iš dvejetainės į dešimtainę")
	,DVEJ_SES ("sk_dvej_ses", "Iš dvejetainės į šešioliktainę")
	,SES_DVEJ ("sk_ses_dvej", "Iš šešioliktainės į dvejetainę")
	,SES_DEST ("sk_ses_dest", "Iš šešioliktainės į dešimtainę")
	,NIEKAIP ("sk_niekaip", "Nekonvertuoti");
	
	public final String trump;
	public final String keitimas;
	
	LstKeitimai (String trump, String keitimas) {
		this.trump = trump;
		this.keitimas = keitimas;
	}

	public String trump () {
		return this.trump;
		
	}
	
	public String keitimas () {
		return this.keitimas;
	}
}
