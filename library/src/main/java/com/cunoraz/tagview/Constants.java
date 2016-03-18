package com.cunoraz.tagview;

import android.graphics.Color;

public class Constants {

	//use dp and sp, not px
	
	//----------------- separator TagView-----------------//
	public static final float DEFAULT_LINE_MARGIN = 5;
	public static final float DEFAULT_TAG_MARGIN = 5;
	public static final float DEFAULT_TAG_TEXT_PADDING_LEFT = 8;
	public static final float DEFAULT_TAG_TEXT_PADDING_TOP = 5;
	public static final float DEFAULT_TAG_TEXT_PADDING_RIGHT = 8;
	public static final float DEFAULT_TAG_TEXT_PADDING_BOTTOM = 5;
	
	public static final float LAYOUT_WIDTH_OFFSET = 2;
	
	//----------------- separator Tag Item-----------------//
	public static final float DEFAULT_TAG_TEXT_SIZE = 14f;
	public static final float DEFAULT_TAG_DELETE_INDICATOR_SIZE = 14f;
	public static final float DEFAULT_TAG_LAYOUT_BORDER_SIZE = 0f;
	public static final float DEFAULT_TAG_RADIUS = 100;
	public static final int DEFAULT_TAG_LAYOUT_COLOR = Color.parseColor("#AED374");
	public static final int DEFAULT_TAG_LAYOUT_COLOR_PRESS = Color.parseColor("#88363636");
	public static final int DEFAULT_TAG_TEXT_COLOR = Color.parseColor("#ffffff");
	public static final int DEFAULT_TAG_DELETE_INDICATOR_COLOR = Color.parseColor("#ffffff");
	public static final int DEFAULT_TAG_LAYOUT_BORDER_COLOR = Color.parseColor("#ffffff");
	public static final String DEFAULT_TAG_DELETE_ICON = "×";
	public static final boolean DEFAULT_TAG_IS_DELETABLE = false;

	/**
	 * list from:
	 *  https://gist.github.com/Keeguon/2310008
	 */
	public static final String COUNTRIES = "[ \n" +
			"{\"name\": \"Afghanistan\", \"code\": \"AF\"}, \n" +
			"{\"name\": \"Åland Islands\", \"code\": \"AX\"}, \n" +
			"{\"name\": \"Albania\", \"code\": \"AL\"}, \n" +
			"{\"name\": \"Algeria\", \"code\": \"DZ\"}, \n" +
			"{\"name\": \"American Samoa\", \"code\": \"AS\"}, \n" +
			"{\"name\": \"AndorrA\", \"code\": \"AD\"}, \n" +
			"{\"name\": \"Angola\", \"code\": \"AO\"}, \n" +
			"{\"name\": \"Anguilla\", \"code\": \"AI\"}, \n" +
			"{\"name\": \"Antarctica\", \"code\": \"AQ\"}, \n" +
			"{\"name\": \"Antigua and Barbuda\", \"code\": \"AG\"}, \n" +
			"{\"name\": \"Argentina\", \"code\": \"AR\"}, \n" +
			"{\"name\": \"Armenia\", \"code\": \"AM\"}, \n" +
			"{\"name\": \"Aruba\", \"code\": \"AW\"}, \n" +
			"{\"name\": \"Australia\", \"code\": \"AU\"}, \n" +
			"{\"name\": \"Austria\", \"code\": \"AT\"}, \n" +
			"{\"name\": \"Azerbaijan\", \"code\": \"AZ\"}, \n" +
			"{\"name\": \"Bahamas\", \"code\": \"BS\"}, \n" +
			"{\"name\": \"Bahrain\", \"code\": \"BH\"}, \n" +
			"{\"name\": \"Bangladesh\", \"code\": \"BD\"}, \n" +
			"{\"name\": \"Barbados\", \"code\": \"BB\"}, \n" +
			"{\"name\": \"Belarus\", \"code\": \"BY\"}, \n" +
			"{\"name\": \"Belgium\", \"code\": \"BE\"}, \n" +
			"{\"name\": \"Belize\", \"code\": \"BZ\"}, \n" +
			"{\"name\": \"Benin\", \"code\": \"BJ\"}, \n" +
			"{\"name\": \"Bermuda\", \"code\": \"BM\"}, \n" +
			"{\"name\": \"Bhutan\", \"code\": \"BT\"}, \n" +
			"{\"name\": \"Bolivia\", \"code\": \"BO\"}, \n" +
			"{\"name\": \"Bosnia and Herzegovina\", \"code\": \"BA\"}, \n" +
			"{\"name\": \"Botswana\", \"code\": \"BW\"}, \n" +
			"{\"name\": \"Bouvet Island\", \"code\": \"BV\"}, \n" +
			"{\"name\": \"Brazil\", \"code\": \"BR\"}, \n" +
			"{\"name\": \"British Indian Ocean Territory\", \"code\": \"IO\"}, \n" +
			"{\"name\": \"Brunei Darussalam\", \"code\": \"BN\"}, \n" +
			"{\"name\": \"Bulgaria\", \"code\": \"BG\"}, \n" +
			"{\"name\": \"Burkina Faso\", \"code\": \"BF\"}, \n" +
			"{\"name\": \"Burundi\", \"code\": \"BI\"}, \n" +
			"{\"name\": \"Cambodia\", \"code\": \"KH\"}, \n" +
			"{\"name\": \"Cameroon\", \"code\": \"CM\"}, \n" +
			"{\"name\": \"Canada\", \"code\": \"CA\"}, \n" +
			"{\"name\": \"Cape Verde\", \"code\": \"CV\"}, \n" +
			"{\"name\": \"Cayman Islands\", \"code\": \"KY\"}, \n" +
			"{\"name\": \"Central African Republic\", \"code\": \"CF\"}, \n" +
			"{\"name\": \"Chad\", \"code\": \"TD\"}, \n" +
			"{\"name\": \"Chile\", \"code\": \"CL\"}, \n" +
			"{\"name\": \"China\", \"code\": \"CN\"}, \n" +
			"{\"name\": \"Christmas Island\", \"code\": \"CX\"}, \n" +
			"{\"name\": \"Cocos (Keeling) Islands\", \"code\": \"CC\"}, \n" +
			"{\"name\": \"Colombia\", \"code\": \"CO\"}, \n" +
			"{\"name\": \"Comoros\", \"code\": \"KM\"}, \n" +
			"{\"name\": \"Congo\", \"code\": \"CG\"}, \n" +
			"{\"name\": \"Congo, The Democratic Republic of the\", \"code\": \"CD\"}, \n" +
			"{\"name\": \"Cook Islands\", \"code\": \"CK\"}, \n" +
			"{\"name\": \"Costa Rica\", \"code\": \"CR\"}, \n" +
			"{\"name\": \"Cote D\\\"Ivoire\", \"code\": \"CI\"}, \n" +
			"{\"name\": \"Croatia\", \"code\": \"HR\"}, \n" +
			"{\"name\": \"Cuba\", \"code\": \"CU\"}, \n" +
			"{\"name\": \"Cyprus\", \"code\": \"CY\"}, \n" +
			"{\"name\": \"Czech Republic\", \"code\": \"CZ\"}, \n" +
			"{\"name\": \"Denmark\", \"code\": \"DK\"}, \n" +
			"{\"name\": \"Djibouti\", \"code\": \"DJ\"}, \n" +
			"{\"name\": \"Dominica\", \"code\": \"DM\"}, \n" +
			"{\"name\": \"Dominican Republic\", \"code\": \"DO\"}, \n" +
			"{\"name\": \"Ecuador\", \"code\": \"EC\"}, \n" +
			"{\"name\": \"Egypt\", \"code\": \"EG\"}, \n" +
			"{\"name\": \"El Salvador\", \"code\": \"SV\"}, \n" +
			"{\"name\": \"Equatorial Guinea\", \"code\": \"GQ\"}, \n" +
			"{\"name\": \"Eritrea\", \"code\": \"ER\"}, \n" +
			"{\"name\": \"Estonia\", \"code\": \"EE\"}, \n" +
			"{\"name\": \"Ethiopia\", \"code\": \"ET\"}, \n" +
			"{\"name\": \"Falkland Islands (Malvinas)\", \"code\": \"FK\"}, \n" +
			"{\"name\": \"Faroe Islands\", \"code\": \"FO\"}, \n" +
			"{\"name\": \"Fiji\", \"code\": \"FJ\"}, \n" +
			"{\"name\": \"Finland\", \"code\": \"FI\"}, \n" +
			"{\"name\": \"France\", \"code\": \"FR\"}, \n" +
			"{\"name\": \"French Guiana\", \"code\": \"GF\"}, \n" +
			"{\"name\": \"French Polynesia\", \"code\": \"PF\"}, \n" +
			"{\"name\": \"French Southern Territories\", \"code\": \"TF\"}, \n" +
			"{\"name\": \"Gabon\", \"code\": \"GA\"}, \n" +
			"{\"name\": \"Gambia\", \"code\": \"GM\"}, \n" +
			"{\"name\": \"Georgia\", \"code\": \"GE\"}, \n" +
			"{\"name\": \"Germany\", \"code\": \"DE\"}, \n" +
			"{\"name\": \"Ghana\", \"code\": \"GH\"}, \n" +
			"{\"name\": \"Gibraltar\", \"code\": \"GI\"}, \n" +
			"{\"name\": \"Greece\", \"code\": \"GR\"}, \n" +
			"{\"name\": \"Greenland\", \"code\": \"GL\"}, \n" +
			"{\"name\": \"Grenada\", \"code\": \"GD\"}, \n" +
			"{\"name\": \"Guadeloupe\", \"code\": \"GP\"}, \n" +
			"{\"name\": \"Guam\", \"code\": \"GU\"}, \n" +
			"{\"name\": \"Guatemala\", \"code\": \"GT\"}, \n" +
			"{\"name\": \"Guernsey\", \"code\": \"GG\"}, \n" +
			"{\"name\": \"Guinea\", \"code\": \"GN\"}, \n" +
			"{\"name\": \"Guinea-Bissau\", \"code\": \"GW\"}, \n" +
			"{\"name\": \"Guyana\", \"code\": \"GY\"}, \n" +
			"{\"name\": \"Haiti\", \"code\": \"HT\"}, \n" +
			"{\"name\": \"Heard Island and Mcdonald Islands\", \"code\": \"HM\"}, \n" +
			"{\"name\": \"Holy See (Vatican City State)\", \"code\": \"VA\"}, \n" +
			"{\"name\": \"Honduras\", \"code\": \"HN\"}, \n" +
			"{\"name\": \"Hong Kong\", \"code\": \"HK\"}, \n" +
			"{\"name\": \"Hungary\", \"code\": \"HU\"}, \n" +
			"{\"name\": \"Iceland\", \"code\": \"IS\"}, \n" +
			"{\"name\": \"India\", \"code\": \"IN\"}, \n" +
			"{\"name\": \"Indonesia\", \"code\": \"ID\"}, \n" +
			"{\"name\": \"Iran, Islamic Republic Of\", \"code\": \"IR\"}, \n" +
			"{\"name\": \"Iraq\", \"code\": \"IQ\"}, \n" +
			"{\"name\": \"Ireland\", \"code\": \"IE\"}, \n" +
			"{\"name\": \"Isle of Man\", \"code\": \"IM\"}, \n" +
			"{\"name\": \"Israel\", \"code\": \"IL\"}, \n" +
			"{\"name\": \"Italy\", \"code\": \"IT\"}, \n" +
			"{\"name\": \"Jamaica\", \"code\": \"JM\"}, \n" +
			"{\"name\": \"Japan\", \"code\": \"JP\"}, \n" +
			"{\"name\": \"Jersey\", \"code\": \"JE\"}, \n" +
			"{\"name\": \"Jordan\", \"code\": \"JO\"}, \n" +
			"{\"name\": \"Kazakhstan\", \"code\": \"KZ\"}, \n" +
			"{\"name\": \"Kenya\", \"code\": \"KE\"}, \n" +
			"{\"name\": \"Kiribati\", \"code\": \"KI\"}, \n" +
			"{\"name\": \"Korea, Democratic People\\\"S Republic of\", \"code\": \"KP\"}, \n" +
			"{\"name\": \"Korea, Republic of\", \"code\": \"KR\"}, \n" +
			"{\"name\": \"Kuwait\", \"code\": \"KW\"}, \n" +
			"{\"name\": \"Kyrgyzstan\", \"code\": \"KG\"}, \n" +
			"{\"name\": \"Lao People\\\"S Democratic Republic\", \"code\": \"LA\"}, \n" +
			"{\"name\": \"Latvia\", \"code\": \"LV\"}, \n" +
			"{\"name\": \"Lebanon\", \"code\": \"LB\"}, \n" +
			"{\"name\": \"Lesotho\", \"code\": \"LS\"}, \n" +
			"{\"name\": \"Liberia\", \"code\": \"LR\"}, \n" +
			"{\"name\": \"Libyan Arab Jamahiriya\", \"code\": \"LY\"}, \n" +
			"{\"name\": \"Liechtenstein\", \"code\": \"LI\"}, \n" +
			"{\"name\": \"Lithuania\", \"code\": \"LT\"}, \n" +
			"{\"name\": \"Luxembourg\", \"code\": \"LU\"}, \n" +
			"{\"name\": \"Macao\", \"code\": \"MO\"}, \n" +
			"{\"name\": \"Macedonia, The Former Yugoslav Republic of\", \"code\": \"MK\"}, \n" +
			"{\"name\": \"Madagascar\", \"code\": \"MG\"}, \n" +
			"{\"name\": \"Malawi\", \"code\": \"MW\"}, \n" +
			"{\"name\": \"Malaysia\", \"code\": \"MY\"}, \n" +
			"{\"name\": \"Maldives\", \"code\": \"MV\"}, \n" +
			"{\"name\": \"Mali\", \"code\": \"ML\"}, \n" +
			"{\"name\": \"Malta\", \"code\": \"MT\"}, \n" +
			"{\"name\": \"Marshall Islands\", \"code\": \"MH\"}, \n" +
			"{\"name\": \"Martinique\", \"code\": \"MQ\"}, \n" +
			"{\"name\": \"Mauritania\", \"code\": \"MR\"}, \n" +
			"{\"name\": \"Mauritius\", \"code\": \"MU\"}, \n" +
			"{\"name\": \"Mayotte\", \"code\": \"YT\"}, \n" +
			"{\"name\": \"Mexico\", \"code\": \"MX\"}, \n" +
			"{\"name\": \"Micronesia, Federated States of\", \"code\": \"FM\"}, \n" +
			"{\"name\": \"Moldova, Republic of\", \"code\": \"MD\"}, \n" +
			"{\"name\": \"Monaco\", \"code\": \"MC\"}, \n" +
			"{\"name\": \"Mongolia\", \"code\": \"MN\"}, \n" +
			"{\"name\": \"Montserrat\", \"code\": \"MS\"}, \n" +
			"{\"name\": \"Morocco\", \"code\": \"MA\"}, \n" +
			"{\"name\": \"Mozambique\", \"code\": \"MZ\"}, \n" +
			"{\"name\": \"Myanmar\", \"code\": \"MM\"}, \n" +
			"{\"name\": \"Namibia\", \"code\": \"NA\"}, \n" +
			"{\"name\": \"Nauru\", \"code\": \"NR\"}, \n" +
			"{\"name\": \"Nepal\", \"code\": \"NP\"}, \n" +
			"{\"name\": \"Netherlands\", \"code\": \"NL\"}, \n" +
			"{\"name\": \"Netherlands Antilles\", \"code\": \"AN\"}, \n" +
			"{\"name\": \"New Caledonia\", \"code\": \"NC\"}, \n" +
			"{\"name\": \"New Zealand\", \"code\": \"NZ\"}, \n" +
			"{\"name\": \"Nicaragua\", \"code\": \"NI\"}, \n" +
			"{\"name\": \"Niger\", \"code\": \"NE\"}, \n" +
			"{\"name\": \"Nigeria\", \"code\": \"NG\"}, \n" +
			"{\"name\": \"Niue\", \"code\": \"NU\"}, \n" +
			"{\"name\": \"Norfolk Island\", \"code\": \"NF\"}, \n" +
			"{\"name\": \"Northern Mariana Islands\", \"code\": \"MP\"}, \n" +
			"{\"name\": \"Norway\", \"code\": \"NO\"}, \n" +
			"{\"name\": \"Oman\", \"code\": \"OM\"}, \n" +
			"{\"name\": \"Pakistan\", \"code\": \"PK\"}, \n" +
			"{\"name\": \"Palau\", \"code\": \"PW\"}, \n" +
			"{\"name\": \"Palestinian Territory, Occupied\", \"code\": \"PS\"}, \n" +
			"{\"name\": \"Panama\", \"code\": \"PA\"}, \n" +
			"{\"name\": \"Papua New Guinea\", \"code\": \"PG\"}, \n" +
			"{\"name\": \"Paraguay\", \"code\": \"PY\"}, \n" +
			"{\"name\": \"Peru\", \"code\": \"PE\"}, \n" +
			"{\"name\": \"Philippines\", \"code\": \"PH\"}, \n" +
			"{\"name\": \"Pitcairn\", \"code\": \"PN\"}, \n" +
			"{\"name\": \"Poland\", \"code\": \"PL\"}, \n" +
			"{\"name\": \"Portugal\", \"code\": \"PT\"}, \n" +
			"{\"name\": \"Puerto Rico\", \"code\": \"PR\"}, \n" +
			"{\"name\": \"Qatar\", \"code\": \"QA\"}, \n" +
			"{\"name\": \"Reunion\", \"code\": \"RE\"}, \n" +
			"{\"name\": \"Romania\", \"code\": \"RO\"}, \n" +
			"{\"name\": \"Russian Federation\", \"code\": \"RU\"}, \n" +
			"{\"name\": \"RWANDA\", \"code\": \"RW\"}, \n" +
			"{\"name\": \"Saint Helena\", \"code\": \"SH\"}, \n" +
			"{\"name\": \"Saint Kitts and Nevis\", \"code\": \"KN\"}, \n" +
			"{\"name\": \"Saint Lucia\", \"code\": \"LC\"}, \n" +
			"{\"name\": \"Saint Pierre and Miquelon\", \"code\": \"PM\"}, \n" +
			"{\"name\": \"Saint Vincent and the Grenadines\", \"code\": \"VC\"}, \n" +
			"{\"name\": \"Samoa\", \"code\": \"WS\"}, \n" +
			"{\"name\": \"San Marino\", \"code\": \"SM\"}, \n" +
			"{\"name\": \"Sao Tome and Principe\", \"code\": \"ST\"}, \n" +
			"{\"name\": \"Saudi Arabia\", \"code\": \"SA\"}, \n" +
			"{\"name\": \"Senegal\", \"code\": \"SN\"}, \n" +
			"{\"name\": \"Serbia and Montenegro\", \"code\": \"CS\"}, \n" +
			"{\"name\": \"Seychelles\", \"code\": \"SC\"}, \n" +
			"{\"name\": \"Sierra Leone\", \"code\": \"SL\"}, \n" +
			"{\"name\": \"Singapore\", \"code\": \"SG\"}, \n" +
			"{\"name\": \"Slovakia\", \"code\": \"SK\"}, \n" +
			"{\"name\": \"Slovenia\", \"code\": \"SI\"}, \n" +
			"{\"name\": \"Solomon Islands\", \"code\": \"SB\"}, \n" +
			"{\"name\": \"Somalia\", \"code\": \"SO\"}, \n" +
			"{\"name\": \"South Africa\", \"code\": \"ZA\"}, \n" +
			"{\"name\": \"South Georgia and the South Sandwich Islands\", \"code\": \"GS\"}, \n" +
			"{\"name\": \"Spain\", \"code\": \"ES\"}, \n" +
			"{\"name\": \"Sri Lanka\", \"code\": \"LK\"}, \n" +
			"{\"name\": \"Sudan\", \"code\": \"SD\"}, \n" +
			"{\"name\": \"Suriname\", \"code\": \"SR\"}, \n" +
			"{\"name\": \"Svalbard and Jan Mayen\", \"code\": \"SJ\"}, \n" +
			"{\"name\": \"Swaziland\", \"code\": \"SZ\"}, \n" +
			"{\"name\": \"Sweden\", \"code\": \"SE\"}, \n" +
			"{\"name\": \"Switzerland\", \"code\": \"CH\"}, \n" +
			"{\"name\": \"Syrian Arab Republic\", \"code\": \"SY\"}, \n" +
			"{\"name\": \"Taiwan, Province of China\", \"code\": \"TW\"}, \n" +
			"{\"name\": \"Tajikistan\", \"code\": \"TJ\"}, \n" +
			"{\"name\": \"Tanzania, United Republic of\", \"code\": \"TZ\"}, \n" +
			"{\"name\": \"Thailand\", \"code\": \"TH\"}, \n" +
			"{\"name\": \"Timor-Leste\", \"code\": \"TL\"}, \n" +
			"{\"name\": \"Togo\", \"code\": \"TG\"}, \n" +
			"{\"name\": \"Tokelau\", \"code\": \"TK\"}, \n" +
			"{\"name\": \"Tonga\", \"code\": \"TO\"}, \n" +
			"{\"name\": \"Trinidad and Tobago\", \"code\": \"TT\"}, \n" +
			"{\"name\": \"Tunisia\", \"code\": \"TN\"}, \n" +
			"{\"name\": \"Turkey\", \"code\": \"TR\"}, \n" +
			"{\"name\": \"Turkmenistan\", \"code\": \"TM\"}, \n" +
			"{\"name\": \"Turks and Caicos Islands\", \"code\": \"TC\"}, \n" +
			"{\"name\": \"Tuvalu\", \"code\": \"TV\"}, \n" +
			"{\"name\": \"Uganda\", \"code\": \"UG\"}, \n" +
			"{\"name\": \"Ukraine\", \"code\": \"UA\"}, \n" +
			"{\"name\": \"United Arab Emirates\", \"code\": \"AE\"}, \n" +
			"{\"name\": \"United Kingdom\", \"code\": \"GB\"}, \n" +
			"{\"name\": \"United States\", \"code\": \"US\"}, \n" +
			"{\"name\": \"United States Minor Outlying Islands\", \"code\": \"UM\"}, \n" +
			"{\"name\": \"Uruguay\", \"code\": \"UY\"}, \n" +
			"{\"name\": \"Uzbekistan\", \"code\": \"UZ\"}, \n" +
			"{\"name\": \"Vanuatu\", \"code\": \"VU\"}, \n" +
			"{\"name\": \"Venezuela\", \"code\": \"VE\"}, \n" +
			"{\"name\": \"Viet Nam\", \"code\": \"VN\"}, \n" +
			"{\"name\": \"Virgin Islands, British\", \"code\": \"VG\"}, \n" +
			"{\"name\": \"Virgin Islands, U.S.\", \"code\": \"VI\"}, \n" +
			"{\"name\": \"Wallis and Futuna\", \"code\": \"WF\"}, \n" +
			"{\"name\": \"Western Sahara\", \"code\": \"EH\"}, \n" +
			"{\"name\": \"Yemen\", \"code\": \"YE\"}, \n" +
			"{\"name\": \"Zambia\", \"code\": \"ZM\"}, \n" +
			"{\"name\": \"Zimbabwe\", \"code\": \"ZW\"} \n" +
			"]";
	private Constants() throws InstantiationException {
		throw new InstantiationException("This class is not for instantiation");
	}
}
