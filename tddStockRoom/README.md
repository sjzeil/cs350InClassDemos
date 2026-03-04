# WareHouse

This is part of a larger project to manage the inventory of a company's warehouse.

The program is intended to both track how much of each kind of item is in the warehouse, but also to issue a daily report
reflecting the changes in inventory for that day, e.g.

    Product            Change   In Stock
    Contraptions         14        14
    Doodads               0        57
    Widgets, large       20       220
    Widgets, small       -5        95

# WareHouse Use case

1. The program is launched. The inventory as of the end of the last working day is loaded from a file.
2. As the day progresses, shipments containing items of various kinds and various quanitites arrive at the warehouse and are stored in the inventory.
3. Intermingled with those arrivals, requested items of various kinds and quantities are transferred to the storefront.
4. At any point during the day, the daily report can be requested, and should appear with content similar to the example above.


# Other Use cases

Not shown are other use cases:

1. Storing the end-of-day inventory in a file
2. Warehouse staff using GUI to record the arrival of a shipment.
3. Store clerks using GUI to request transfer of items from the warehouse.
