
 --SQL case insensitive dir yani büyük küçük harfe DUYARSIZDIR

-->Bu sorgu Customers tablosunu getirir.
Select*from Customers

-->Bu sorgu Customers tablosundan istenilen kısımları getirir.
Select ContactName,CompanyName,City from Customers

-->Alies:Tabloya veya sütuna  geçiçi ad verir
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

-->WHERE:Şarta göre verileri getirir
Select*FROM Customers WHERE City='Berlin'

-->OR(Yada):İki şarttan birisinin geçerli olması yeterli
Select*From Products where CategoryID=1 or CategoryID=3

-->And(Ve):İki şartın sağlanması gerek
Select*From Products where CategoryID=1 and UnitPrice>=10

-->Order By(Artan):Default asc küçükten büyüğe doğru sıralama yapar
Select*From Products order by UnitPrice asc

-->Desc(Azalan):Büyükten küçüğe doğru sıralama yapar
Select*From Products where CategoryID=1 order by UnitPrice desc

-->Count:Belirtilen ölçütlerle eşleşen satır sayısını döndürür
Select COUNT(*) Adet  from Products where CategoryID=2

Select CategoryId, COUNT(*)  from Products where UnitPrice>20 group by CategoryId having  COUNT(*)<10

--> JOIN ifadesi, tabloları birleştirmek için kullanılır.
select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName
from Products inner join Categories on Products.CategoryID=Categories.CategoryID
where Products.UnitPrice>10


Select*From Products p inner  join [Order Details] od on p.ProductID=od.ProductID
inner join Orders o on o.OrderID=od.OrderID

-->Left soldan ekleme
Select*From Customers c left join Orders o on c.CustomerID=o.CustomerID
where o.CustomerID is null






















