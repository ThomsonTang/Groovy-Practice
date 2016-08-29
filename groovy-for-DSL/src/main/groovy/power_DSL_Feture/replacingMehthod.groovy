class BankManager {
    def loan_approval_status = false

    boolean approveLoan() {
        return loan_approval_status
    }
}

def myBankManager = new BankManager()
assert myBankManager.approveLoan() == false
BankManager.metaClass.approveLoan = { true }

myBankManager = new BankManager()
assert myBankManager.approveLoan() == true

Calendar.metaClass.static.getInstance = { new GregorianCalendar() }
println Calendar.getInstance().getTime()
Calendar.metaClass.static.now = { Calendar.getInstance().getTime() }
println Calendar.now()
