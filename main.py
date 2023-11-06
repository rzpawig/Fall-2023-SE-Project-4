import datetime

def luhn_checksum(card_number):
    def digits_of(n):
        return [int(d) for d in str(n)]
    digits = digits_of(card_number)
    odd_digits = digits[-1::-2]
    even_digits = digits[-2::-2]
    checksum = sum(odd_digits)
    for d in even_digits:
        checksum += sum(digits_of(d*2))
    return checksum % 10

def is_luhn_valid(card_number):
    return luhn_checksum(card_number) == 0

def validate_card_type(card_type):
    return card_type in ['VISA', 'Mastercard', 'AMEX', 'Discover']

def validate_cvv(card_type, cvv):
    if card_type == 'AMEX':
        return len(cvv) == 4
    else:
        return len(cvv) == 3

def validate_date(month, year):
    current_date = datetime.datetime.now()
    expiration_date = datetime.datetime(year, month, 1)
    return expiration_date > current_date

def main():
    card_type = input("Enter your card type (VISA, Mastercard, AMEX, Discover): ")
    if not validate_card_type(card_type):
        print("Invalid card type.")
        return
    
    card_number = input("Enter your credit card number: ")
    if not is_luhn_valid(card_number):
        print("Invalid card number.")
        return
    
    exp_month = int(input("Enter the expiration month (MM): "))
    exp_year = int(input("Enter the expiration year (YYYY): "))
    if not validate_date(exp_month, exp_year):
        print("Invalid card: The card is expired.")
        return
    
    cvv = input("Enter your CVV: ")
    if not validate_cvv(card_type, cvv):
        print("Invalid CVV.")
        return
    
    print("Valid card.")

if __name__ == "__main__":
    main()
