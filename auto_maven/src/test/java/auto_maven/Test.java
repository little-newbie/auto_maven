package auto_maven;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Test {
	public static void main(String[] args) {
		String str = "{\"success\":true,\"msg\":\"查询信息成功!\",\"content\":null,\"msgCode\":null,\"retObj\":{\"id\":\"9203c2dfb6a948d3baeaa283003ab51f\",\"belong\":\"1568\",\"userId\":\"2668\",\"createTime\":null,\"invoiceType\":2,\"linkTel\":\"15202310201\",\"linkAdd\":\"订单\",\"acceptor\":\"清算物流企业一\",\"taxpayerId\":\"A20500A1522HHH02200\",\"bankName\":\"中国工商银行深圳市民中心分行\",\"bankCard\":\"622585452105200\",\"invoiceName\":null,\"linker\":null,\"provinceId\":\"110000\",\"cityId\":\"110100\",\"districtId\":\"110101\",\"invoiceRemark\":null,\"isNeedSend\":\"0\",\"receiverName\":null,\"receiverPhone\":null,\"sendProvinceId\":null,\"sendCityId\":null,\"sendDistrictId\":null,\"sendDetailAdd\":null,\"chineseInvoiceAddress\":\"北京市北京市东城区\",\"chineseMailAddress\":\"\"}}";
		//String jsonStr = "{\"success\":true,\"msg\":\"查询信息成功!\",\"content\":null,\"msgCode\":null,\"retObj\":{\"id\":\"9203c2dfb6a948d3baeaa283003ab51f\",\"belong\":\"1568\",\"userId\":\"2668\",\"createTime\":null,\"invoiceType\":null,\"linkTel\":\"15202310201\",\"linkAdd\":\"订单\",\"acceptor\":\"清算物流企业一\",\"taxpayerId\":\"A20500A1522HHH02200\",\"bankName\":\"中国工商银行深圳市民中心分行\",\"bankCard\":\"622585452105200\",\"invoiceName\":null,\"linker\":null,\"provinceId\":\"110000\",\"cityId\":\"110100\",\"districtId\":\"110101\",\"invoiceRemark\":null,\"isNeedSend\":\"0\",\"receiverName\":null,\"receiverPhone\":null,\"sendProvinceId\":null,\"sendCityId\":null,\"sendDistrictId\":null,\"sendDetailAdd\":null,\"chineseInvoiceAddress\":\"北京市北京市东城区\",\"chineseMailAddress\":\"\"}}";
		String userType = "true";
		List<String> list = new ArrayList<String>();
		list.add("2");
		list.add("3");
		Random random = new Random();
		int i = random.nextInt(list.size());
		JSONObject jsonObject = JSONObject.parseObject(str);
		JSONObject retObj = jsonObject.getJSONObject("retObj");
		retObj.remove("id");
		retObj.remove("belong");
		retObj.remove("userId");
		retObj.remove("createTime");
		retObj.remove("chineseInvoiceAddress");
		retObj.remove("chineseMailAddress");
		retObj.remove("invoiceName");
		retObj.remove("linker");
		if ("false".equals(userType)) {
			retObj.put("invoiceType", "3");
		}else {
			retObj.put("invoiceType",list.get(i));
		}
		Set<Entry<String, Object>> entrySet = retObj.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			if (entry.getValue() == null || "".equals(entry.getValue())) {
				if ("taxpayerId".equals(entry.getKey())) {
					entry.setValue("123456789ASDFGH");
				}if ("linkTel".equals(entry.getKey())) {
					entry.setValue("13252012012");
				}if ("bankName".equals(entry.getKey())) {
					entry.setValue("中国工商银行深圳分行");
				}if ("bankCard".equals(entry.getKey())) {
					entry.setValue("6252102015201250");
				}if ("provinceId".equals(entry.getKey())) {
					entry.setValue("230000");
				}if ("cityId".equals(entry.getKey())) {
					entry.setValue("230200");
				}if ("districtId".equals(entry.getKey())) {
					entry.setValue("230203");
				}if ("linkAdd".equals(entry.getKey())) {
					entry.setValue("人民路一号");
				}if("invoiceType".equals(entry.getKey())) {
					entry.setValue("3");
				}
			}
		}
		
		String InvoiceInfo = JSON.toJSONString(retObj);
		System.out.println(InvoiceInfo);
	}
}
