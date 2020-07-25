<!DOCTYPE html>
<html>
<head>
<title>Invoice</title>
</head>
<body>
	<h3>Dear ${name},</h3>

	<p>Your order has been successful!</p><br/>
    <p>Thanks for shopping on Sondors! You didn't just get a great deal -- you also supported the growth of the Sondors community, which is pretty cool. Have question or feedback? You can contact us at +84 327 008 005 or hoangloi669@gmail.com</p>
    <br/>
    <table>
        <#list bikes as bike>
            <tr style="border: 1px solid #d9d9d9; padding: 10px 0">
                <td style="width: 40%"><img src=${bike.imageUrl} width="70" height="70" /></td>
                <td style="width: 20%">${bike.name}</td>
                <td style="width: 40%; text-align: right">${bike.quantity} x ${bike.price}</td>
            </tr>
        </#list>
        <#list apparels as apparel>
            <tr style="border: 1px solid #d9d9d9; padding: 10px 0">
                <td style="width: 40%"><img src=${apparel.imageUrl} width="70" height="70" /></td>
                <td style="width: 20%">${apparel.name}</td>
                <td style="width: 40%; text-align: right">${apparel.quantity} x ${apparel.price}</td>
            </tr>
        </#list>
        </table>	
        <br/>
        <strong>Your name: </strong>${name}<br/>
        <strong>Shipping Address: </strong>${address}<br/>
        <strong>Phone: </strong>${phone}<br/>
        <strong>Email: </strong>${email}<br/>
        <strong>Total: </strong>$${total}<br/>
        <br/>
	<p>Regards,</p>
	<p>Sondors Team</p>
</body>
</html>