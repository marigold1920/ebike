<!DOCTYPE html>
<html>
<head>
<title>Invoice</title>
</head>
<body>
	<h3>Dear ${name},</h3>

	<p>Your order has been successful!</p>
    <p>Thanks for shopping on Sondors! You didn't just get a great deal -- you also supported the growth of the Sondors community, which is pretty cool. Have question or feedback? You can contact us at +84 327 008 005 or hoangloi669@gmail.com</p>
    <table>
        <#list products as product>
            <tr style="border: 1px solid #d9d9d9; padding: 10px 0">
                <td style="width: 40%"><img src=${product.imageUrl} width="70" height="70" /></td>
                <td style="width: 20%">${product.name}</td>
                <td style="width: 40%; text-align: right">${product.quantity} x ${product.price}</td>
            </tr>
        </#list>
        </table>	

	<p>Regards,</p>
	<p>Sondors Team</p>
</body>
</html>